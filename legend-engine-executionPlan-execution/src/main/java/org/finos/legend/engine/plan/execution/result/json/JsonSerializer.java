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

package org.finos.legend.engine.plan.execution.result.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import org.finos.legend.engine.plan.execution.result.serialization.Serializer;

import java.io.IOException;
import java.io.OutputStream;

abstract class JsonSerializer extends Serializer
{
    JsonGenerator createGenerator(OutputStream stream) throws IOException
    {
        return new JsonFactory().createGenerator(stream)
                .disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)
                .disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET)
                .enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
    }
}
