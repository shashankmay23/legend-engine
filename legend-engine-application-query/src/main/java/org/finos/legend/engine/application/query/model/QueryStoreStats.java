//  Copyright 2022 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

package org.finos.legend.engine.application.query.model;

public class QueryStoreStats
{

    Long queryCount;
    Long queryCreatedFromDataSpaceCount;

    public Long getQueryCount()
    {
        return queryCount;
    }

    public Long getQueryCreatedFromDataSpaceCount()
    {
        return queryCreatedFromDataSpaceCount;
    }

    public void setQueryCount(Long queryCount)
    {
        this.queryCount = queryCount;
    }

    public void setQueryCreatedFromDataSpaceCount(Long queryCount)
    {
        this.queryCreatedFromDataSpaceCount = queryCount;
    }
}
