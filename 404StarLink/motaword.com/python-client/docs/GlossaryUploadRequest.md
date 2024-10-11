# GlossaryUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glossaries** | **bytearray** | You can only add one glossary, even though the name suggests multiple glossaries. This may be updated in the future to support multiple glossaries. | 

## Example

```python
from openapi_client.models.glossary_upload_request import GlossaryUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GlossaryUploadRequest from a JSON string
glossary_upload_request_instance = GlossaryUploadRequest.from_json(json)
# print the JSON string representation of the object
print(GlossaryUploadRequest.to_json())

# convert the object into a dict
glossary_upload_request_dict = glossary_upload_request_instance.to_dict()
# create an instance of GlossaryUploadRequest from a dict
glossary_upload_request_from_dict = GlossaryUploadRequest.from_dict(glossary_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


