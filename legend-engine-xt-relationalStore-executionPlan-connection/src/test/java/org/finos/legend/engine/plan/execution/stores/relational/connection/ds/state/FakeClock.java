// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.plan.execution.stores.relational.connection.ds.state;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class FakeClock extends Clock
{
    private long currentTimeInMillis;

    public FakeClock(long currentTimeInMillis)
    {
        this.currentTimeInMillis = currentTimeInMillis;
    }

    public void advance(Duration duration)
    {
        this.currentTimeInMillis += duration.toMillis();
    }

    @Override
    public ZoneId getZone()
    {
        return null;
    }

    @Override
    public Clock withZone(ZoneId zone)
    {
        return null;
    }

    @Override
    public Instant instant()
    {
        return null;
    }

    @Override
    public long millis()
    {
        return this.currentTimeInMillis;
    }
}