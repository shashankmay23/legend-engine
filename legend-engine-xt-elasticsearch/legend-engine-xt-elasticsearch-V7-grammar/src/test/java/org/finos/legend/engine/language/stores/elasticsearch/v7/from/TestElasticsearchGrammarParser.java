// Copyright 2023 Goldman Sachs
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
//

package org.finos.legend.engine.language.stores.elasticsearch.v7.from;

import java.util.List;
import org.antlr.v4.runtime.Vocabulary;
import org.eclipse.collections.impl.list.mutable.ListAdapter;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.ElasticsearchParserGrammar;
import org.finos.legend.engine.language.pure.grammar.test.TestGrammarParser;

public class TestElasticsearchGrammarParser extends TestGrammarParser.TestGrammarParserTestSuite
{
    @Override
    public Vocabulary getParserGrammarVocabulary()
    {
        return ElasticsearchParserGrammar.VOCABULARY;
    }

    @Override
    public String getParserGrammarIdentifierInclusionTestCode(List<String> keywords)
    {
        return "###Elasticsearch\n" +
                "import abc::abc::*;\n" +
                "Elasticsearch7Cluster " + ListAdapter.adapt(keywords).makeString("::") + "\n" +
                "{\n" +
                "  indices: [\n" +
                "    index1: {\n" +
                "      properties: [\n" +
                "        prop1: Keyword,\n" +
                "        prop2: Keyword {\n" +
                "          fields: [\n" +
                "            english: Keyword" +
                "          ];\n" +
                "        }\n" +
                "      ];\n" +
                "    },\n" +
                "    'index-WrappedOnQuotes': {\n" +
                "      properties: [\n" +
                "        'prop1-wrapped': Keyword\n" +
                "      ];\n" +
                "    }\n" +
                "  ];\n" +
                "}\n";
    }
}
