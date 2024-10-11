# openapi_client.DependabotApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dependabot_add_selected_repo_to_org_secret**](DependabotApi.md#dependabot_add_selected_repo_to_org_secret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret
[**dependabot_create_or_update_org_secret**](DependabotApi.md#dependabot_create_or_update_org_secret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name} | Create or update an organization secret
[**dependabot_create_or_update_repo_secret**](DependabotApi.md#dependabot_create_or_update_repo_secret) | **PUT** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Create or update a repository secret
[**dependabot_delete_org_secret**](DependabotApi.md#dependabot_delete_org_secret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name} | Delete an organization secret
[**dependabot_delete_repo_secret**](DependabotApi.md#dependabot_delete_repo_secret) | **DELETE** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Delete a repository secret
[**dependabot_get_org_public_key**](DependabotApi.md#dependabot_get_org_public_key) | **GET** /orgs/{org}/dependabot/secrets/public-key | Get an organization public key
[**dependabot_get_org_secret**](DependabotApi.md#dependabot_get_org_secret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name} | Get an organization secret
[**dependabot_get_repo_public_key**](DependabotApi.md#dependabot_get_repo_public_key) | **GET** /repos/{owner}/{repo}/dependabot/secrets/public-key | Get a repository public key
[**dependabot_get_repo_secret**](DependabotApi.md#dependabot_get_repo_secret) | **GET** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Get a repository secret
[**dependabot_list_org_secrets**](DependabotApi.md#dependabot_list_org_secrets) | **GET** /orgs/{org}/dependabot/secrets | List organization secrets
[**dependabot_list_repo_secrets**](DependabotApi.md#dependabot_list_repo_secrets) | **GET** /repos/{owner}/{repo}/dependabot/secrets | List repository secrets
[**dependabot_list_selected_repos_for_org_secret**](DependabotApi.md#dependabot_list_selected_repos_for_org_secret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | List selected repositories for an organization secret
[**dependabot_remove_selected_repo_from_org_secret**](DependabotApi.md#dependabot_remove_selected_repo_from_org_secret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret
[**dependabot_set_selected_repos_for_org_secret**](DependabotApi.md#dependabot_set_selected_repos_for_org_secret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | Set selected repositories for an organization secret


# **dependabot_add_selected_repo_to_org_secret**
> dependabot_add_selected_repo_to_org_secret(org, secret_name, repository_id)

Add selected repository to an organization secret

Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    repository_id = 56 # int | 

    try:
        # Add selected repository to an organization secret
        api_instance.dependabot_add_selected_repo_to_org_secret(org, secret_name, repository_id)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_add_selected_repo_to_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **repository_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content when repository was added to the selected list |  -  |
**409** | Conflict when visibility type is not set to selected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_create_or_update_org_secret**
> object dependabot_create_or_update_org_secret(org, secret_name, dependabot_create_or_update_org_secret_request)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  ``` const sodium = require('libsodium-wrappers') const secret = 'plain-text-secret' // replace with the secret you want to encrypt const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() => {   // Convert Secret & Base64 key to Uint8Array.   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec = sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes = sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); ```  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  ``` from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -> str:   \"\"\"Encrypt a Unicode string using the public key.\"\"\"   public_key = public.PublicKey(public_key.encode(\"utf-8\"), encoding.Base64Encoder())   sealed_box = public.SealedBox(public_key)   encrypted = sealed_box.encrypt(secret_value.encode(\"utf-8\"))   return b64encode(encrypted).decode(\"utf-8\") ```  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  ``` var secretValue = System.Text.Encoding.UTF8.GetBytes(\"mySecret\"); var publicKey = Convert.FromBase64String(\"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=\");  var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); ```  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  ```ruby require \"rbnacl\" require \"base64\"  key = Base64.decode64(\"+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=\") public_key = RbNaCl::PublicKey.new(key)  box = RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret = box.encrypt(\"my_secret\")  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) ```

### Example


```python
import openapi_client
from openapi_client.models.dependabot_create_or_update_org_secret_request import DependabotCreateOrUpdateOrgSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    dependabot_create_or_update_org_secret_request = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678","selected_repository_ids":["1296269","1296280"],"visibility":"selected"} # DependabotCreateOrUpdateOrgSecretRequest | 

    try:
        # Create or update an organization secret
        api_response = api_instance.dependabot_create_or_update_org_secret(org, secret_name, dependabot_create_or_update_org_secret_request)
        print("The response of DependabotApi->dependabot_create_or_update_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_create_or_update_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **dependabot_create_or_update_org_secret_request** | [**DependabotCreateOrUpdateOrgSecretRequest**](DependabotCreateOrUpdateOrgSecretRequest.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when creating a secret |  -  |
**204** | Response when updating a secret |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_create_or_update_repo_secret**
> object dependabot_create_or_update_repo_secret(owner, repo, secret_name, dependabot_create_or_update_repo_secret_request)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  ``` const sodium = require('libsodium-wrappers') const secret = 'plain-text-secret' // replace with the secret you want to encrypt const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() => {   // Convert Secret & Base64 key to Uint8Array.   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec = sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes = sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); ```  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  ``` from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -> str:   \"\"\"Encrypt a Unicode string using the public key.\"\"\"   public_key = public.PublicKey(public_key.encode(\"utf-8\"), encoding.Base64Encoder())   sealed_box = public.SealedBox(public_key)   encrypted = sealed_box.encrypt(secret_value.encode(\"utf-8\"))   return b64encode(encrypted).decode(\"utf-8\") ```  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  ``` var secretValue = System.Text.Encoding.UTF8.GetBytes(\"mySecret\"); var publicKey = Convert.FromBase64String(\"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=\");  var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); ```  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  ```ruby require \"rbnacl\" require \"base64\"  key = Base64.decode64(\"+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=\") public_key = RbNaCl::PublicKey.new(key)  box = RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret = box.encrypt(\"my_secret\")  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) ```

### Example


```python
import openapi_client
from openapi_client.models.dependabot_create_or_update_repo_secret_request import DependabotCreateOrUpdateRepoSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    dependabot_create_or_update_repo_secret_request = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678"} # DependabotCreateOrUpdateRepoSecretRequest | 

    try:
        # Create or update a repository secret
        api_response = api_instance.dependabot_create_or_update_repo_secret(owner, repo, secret_name, dependabot_create_or_update_repo_secret_request)
        print("The response of DependabotApi->dependabot_create_or_update_repo_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_create_or_update_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **dependabot_create_or_update_repo_secret_request** | [**DependabotCreateOrUpdateRepoSecretRequest**](DependabotCreateOrUpdateRepoSecretRequest.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when creating a secret |  -  |
**204** | Response when updating a secret |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_delete_org_secret**
> dependabot_delete_org_secret(org, secret_name)

Delete an organization secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Delete an organization secret
        api_instance.dependabot_delete_org_secret(org, secret_name)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_delete_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_delete_repo_secret**
> dependabot_delete_repo_secret(owner, repo, secret_name)

Delete a repository secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Delete a repository secret
        api_instance.dependabot_delete_repo_secret(owner, repo, secret_name)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_delete_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_get_org_public_key**
> DependabotPublicKey dependabot_get_org_public_key(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_public_key import DependabotPublicKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get an organization public key
        api_response = api_instance.dependabot_get_org_public_key(org)
        print("The response of DependabotApi->dependabot_get_org_public_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_get_org_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_get_org_secret**
> OrganizationDependabotSecret dependabot_get_org_secret(org, secret_name)

Get an organization secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.organization_dependabot_secret import OrganizationDependabotSecret
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Get an organization secret
        api_response = api_instance.dependabot_get_org_secret(org, secret_name)
        print("The response of DependabotApi->dependabot_get_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_get_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

[**OrganizationDependabotSecret**](OrganizationDependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_get_repo_public_key**
> DependabotPublicKey dependabot_get_repo_public_key(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_public_key import DependabotPublicKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get a repository public key
        api_response = api_instance.dependabot_get_repo_public_key(owner, repo)
        print("The response of DependabotApi->dependabot_get_repo_public_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_get_repo_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_get_repo_secret**
> DependabotSecret dependabot_get_repo_secret(owner, repo, secret_name)

Get a repository secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_secret import DependabotSecret
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Get a repository secret
        api_response = api_instance.dependabot_get_repo_secret(owner, repo, secret_name)
        print("The response of DependabotApi->dependabot_get_repo_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_get_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

[**DependabotSecret**](DependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_list_org_secrets**
> DependabotListOrgSecrets200Response dependabot_list_org_secrets(org, per_page=per_page, page=page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_list_org_secrets200_response import DependabotListOrgSecrets200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization secrets
        api_response = api_instance.dependabot_list_org_secrets(org, per_page=per_page, page=page)
        print("The response of DependabotApi->dependabot_list_org_secrets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_list_org_secrets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**DependabotListOrgSecrets200Response**](DependabotListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_list_repo_secrets**
> DependabotListRepoSecrets200Response dependabot_list_repo_secrets(owner, repo, per_page=per_page, page=page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_list_repo_secrets200_response import DependabotListRepoSecrets200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository secrets
        api_response = api_instance.dependabot_list_repo_secrets(owner, repo, per_page=per_page, page=page)
        print("The response of DependabotApi->dependabot_list_repo_secrets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_list_repo_secrets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**DependabotListRepoSecrets200Response**](DependabotListRepoSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_list_selected_repos_for_org_secret**
> ActionsListSelectedReposForOrgSecret200Response dependabot_list_selected_repos_for_org_secret(org, secret_name, page=page, per_page=per_page)

List selected repositories for an organization secret

Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_selected_repos_for_org_secret200_response import ActionsListSelectedReposForOrgSecret200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List selected repositories for an organization secret
        api_response = api_instance.dependabot_list_selected_repos_for_org_secret(org, secret_name, page=page, per_page=per_page)
        print("The response of DependabotApi->dependabot_list_selected_repos_for_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_list_selected_repos_for_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_remove_selected_repo_from_org_secret**
> dependabot_remove_selected_repo_from_org_secret(org, secret_name, repository_id)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    repository_id = 56 # int | 

    try:
        # Remove selected repository from an organization secret
        api_instance.dependabot_remove_selected_repo_from_org_secret(org, secret_name, repository_id)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_remove_selected_repo_from_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **repository_id** | **int**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response when repository was removed from the selected list |  -  |
**409** | Conflict when visibility type not set to selected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dependabot_set_selected_repos_for_org_secret**
> dependabot_set_selected_repos_for_org_secret(org, secret_name, dependabot_set_selected_repos_for_org_secret_request)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.dependabot_set_selected_repos_for_org_secret_request import DependabotSetSelectedReposForOrgSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DependabotApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    dependabot_set_selected_repos_for_org_secret_request = {"selected_repository_ids":[64780797]} # DependabotSetSelectedReposForOrgSecretRequest | 

    try:
        # Set selected repositories for an organization secret
        api_instance.dependabot_set_selected_repos_for_org_secret(org, secret_name, dependabot_set_selected_repos_for_org_secret_request)
    except Exception as e:
        print("Exception when calling DependabotApi->dependabot_set_selected_repos_for_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **dependabot_set_selected_repos_for_org_secret_request** | [**DependabotSetSelectedReposForOrgSecretRequest**](DependabotSetSelectedReposForOrgSecretRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

