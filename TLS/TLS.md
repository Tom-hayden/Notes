# TLS Notes.

These notes are mostly taken from the apigee documentation which can be found [here](https://docs.apigee.com/api-platform/system-administration/ssl).

## Intro

TLS (transport layer security) is the standard security technology for establishing an encrypted link between a web server and a web client.

An encrypted link ensures that all data passing between the server and the client remains private.

One way TLS enables the client to verify the identity of the server. Two way allows the server to authenticate the identity of the client as well.

Here are some key words to remember:
  - TLS certificate: A digital file that identifies an entity in a TLS transaction. This contains some information about the client/server which has been encrypted by a private key.
  - Self signed certificate
  - certificate chain
  - Certificate authority
  - Public Key
  - CSR
  - Keystore
  - Truststore
  - PEM file
  - PKCS12/PFX file
  - Server Name Indication (SNI)
  
