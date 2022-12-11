# StyleGuideUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**styleguides** | **bytearray** | You can only add one style guide, even though the name suggests multiple style guides. This may be updated in the future to support multiple style guides. | 

## Example

```python
from openapi_client.models.style_guide_upload_request import StyleGuideUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StyleGuideUploadRequest from a JSON string
style_guide_upload_request_instance = StyleGuideUploadRequest.from_json(json)
# print the JSON string representation of the object
print(StyleGuideUploadRequest.to_json())

# convert the object into a dict
style_guide_upload_request_dict = style_guide_upload_request_instance.to_dict()
# create an instance of StyleGuideUploadRequest from a dict
style_guide_upload_request_from_dict = StyleGuideUploadRequest.from_dict(style_guide_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


