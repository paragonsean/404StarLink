# AccountStyleGuideUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**styleguide** | **bytearray** | Style guide file. Currently supported formats: .pdf, .docx, .txt | 

## Example

```python
from openapi_client.models.account_style_guide_upload_request import AccountStyleGuideUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AccountStyleGuideUploadRequest from a JSON string
account_style_guide_upload_request_instance = AccountStyleGuideUploadRequest.from_json(json)
# print the JSON string representation of the object
print(AccountStyleGuideUploadRequest.to_json())

# convert the object into a dict
account_style_guide_upload_request_dict = account_style_guide_upload_request_instance.to_dict()
# create an instance of AccountStyleGuideUploadRequest from a dict
account_style_guide_upload_request_from_dict = AccountStyleGuideUploadRequest.from_dict(account_style_guide_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


