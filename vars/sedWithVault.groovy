def call(Map config = [:]) {

            withVault(configuration: [timeout: 60, vaultCredentialId: config.vaultCredentialId, vaultUrl: config.vaultUrl], vaultSecrets: [[path: config.path, secretValues: [[isRequired: false, vaultKey: config.vaultKey]]]]) {
                        // some block
                        sh'echo value retrived'
                        sh "sed -i 's/MYDBUSER/${config.vaultKey}/g' src/main/resources/application.properties"
                        
                }

}
