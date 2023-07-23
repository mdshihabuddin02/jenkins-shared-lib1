def call(Map config = [:]) {

            withVault(configuration: [timeout: 60, vaultCredentialId: config.vaultCredentialId, vaultUrl: config.vaultUrl], vaultSecrets: [[path: config.path, secretValues: [[isRequired: false, vaultKey: config.vaultKey]]]]) {
                        // some block
                        sh'echo value retrived'
                        
                }

}
