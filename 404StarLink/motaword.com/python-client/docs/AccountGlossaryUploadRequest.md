# AccountGlossaryUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glossary** | **bytearray** | Glossary file. Currently supported formats: .xlsx, .tbx | 

## Example

```python
from openapi_client.models.account_glossary_upload_request import AccountGlossaryUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AccountGlossaryUploadRequest from a JSON string
account_glossary_upload_request_instance = AccountGlossaryUploadRequest.from_json(json)
# print the JSON string representation of the object
print(AccountGlossaryUploadRequest.to_json())

# convert the object into a dict
account_glossary_upload_request_dict = account_glossary_upload_request_instance.to_dict()
# create an instance of AccountGlossaryUploadRequest from a dict
account_glossary_upload_request_from_dict = AccountGlossaryUploadRequest.from_dict(account_glossary_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


