# TLS Notes.

These notes are mostly taken from the apigee documentation which can be found [here](https://docs.apigee.com/api-platform/system-administration/ssl).

## Intro

TLS (transport layer security) is the standard security technology for establishing an encrypted link between a web server and a web client.

An encrypted link ensures that all data passing between the server and the client remains private.

One way TLS enables the client to verify the identity of the server. Two way allows the server to authenticate the identity of the client as well.

Here are some key words to remember:
  - TLS certificate: A digital file that identifies an entity in a TLS transaction. This contains some information about the client/server which has been encrypted by a private key.
  - Self signed certificate: Certificate that is not signed by a trusted CA. The issuer and the subject are identical; they are signed with the private key matching the public key they contain.
  - certificate chain: Often you will not have a certificate signed by your CA's root private key. Instead, you have your cert along with one or more intermediate certs that form a chain. The last intermediate cert in the chain is typically signed by the CA's root private key.
  - Certificate authority: A trusted entity such a Symantec or VeriSign, used to issue certs and to validate the authenticity of a cert. Ine type of cert, called a self-signed cert does not require a CA.
  - Public Key: Used to encrypt data sent from a TLS client to a TLS server. The public key is included in the cert. All TLS clients have a copy of the server's public key.
  - Private key: Used on the TLS server to decrypt data. Only the TLS server has the private key - it is not shared with TLS clients.
  - CSR: A certificate signing request (CSR) is a file generated on the TLS server based on the private key. The CSR contains the public key and other information like organizations name, location, and domain name. The CA will sign the CSR to create a TLS certificate. You typically generate a CSR when you have an expired cert and want to renew it.
  - Keystore: Contains the TLS certificate and private key used to identify the entity during TLS handshaking.
  - Truststore: Contains trusted certificates on a TLS client used to validate a TLS server's certificate presented to the client. These certificates are typically self-signed certificates or certificates that are not signed by a trusted CA.
  - PEM file: Text files which comply with the X.509 format for storing a certificate, certificate chain, or private key. If your cert or private key is not defined by a PEM file, you can convert it to a PEM file by using utilities such as openssl.
  - PKCS12/PFX file: A binary file format for storing a certificate, any intermediate certificates, and the private key in a single encryptable file. PFX files usually have the extensions .pfx and .p12. PFX files are typically used on Windows machines to import and export certificates and private keys.
  - Server Name Indication (SNI): Allows multiple HTTPS targets to be served off the same IP address and port without requiring those targets to use the same certificate.
  
