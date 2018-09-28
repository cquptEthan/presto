/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.ranger;

import com.facebook.presto.spi.SchemaTableName;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.assertEquals;

public class TestRangerPrestoResource
{
    @Test
    public void testGetSchemaTable() throws Exception
    {
        String catalog = "catalog";
        String database = "database";
        String table = "table";
        String columns = "columns";
        RangerPrestoResource rangerPrestoResource = new RangerPrestoResource(catalog, database, table, Optional.of(columns));
        SchemaTableName schemaTable = rangerPrestoResource.getSchemaTable();
        assertEquals(schemaTable.getSchemaName(), database);
        assertEquals(schemaTable.getTableName(), table);
    }
}
