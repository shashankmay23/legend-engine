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

package org.finos.legend.engine.authentication.credential;

import org.finos.legend.engine.authentication.DatabaseAuthenticationFlow;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.relational.connection.authentication.AuthenticationStrategy;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.relational.connection.specification.DatasourceSpecification;
import org.finos.legend.engine.shared.core.identity.Credential;
import org.finos.legend.engine.shared.core.identity.Identity;

public class CredentialSupplier
{
    private final DatabaseAuthenticationFlow databaseAuthenticationFlow;
    private final DatasourceSpecification datasourceSpecification;
    private final AuthenticationStrategy authenticationStrategy;
    private DatabaseAuthenticationFlow.RuntimeContext runtimeContext;

    public CredentialSupplier(DatabaseAuthenticationFlow databaseAuthenticationFlow, DatasourceSpecification datasourceSpecification, AuthenticationStrategy authenticationStrategy, DatabaseAuthenticationFlow.RuntimeContext runtimeContext)
    {
        this.databaseAuthenticationFlow = databaseAuthenticationFlow;
        this.datasourceSpecification = datasourceSpecification;
        this.authenticationStrategy = authenticationStrategy;
        this.runtimeContext = runtimeContext;
    }

    public CredentialSupplier(DatabaseAuthenticationFlow databaseAuthenticationFlow, DatasourceSpecification datasourceSpecification, AuthenticationStrategy authenticationStrategy)
    {
        this(databaseAuthenticationFlow, datasourceSpecification, authenticationStrategy, DatabaseAuthenticationFlow.RuntimeContext.empty());
    }

    public Credential getCredential(Identity identity) throws Exception
    {
        return this.databaseAuthenticationFlow.makeCredential(identity, this.datasourceSpecification, this.authenticationStrategy, this.runtimeContext);
    }
}