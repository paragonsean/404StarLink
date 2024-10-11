# UpdateTemplateActiveVersionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_active_version_request** | [**UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest**](UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest.md) |  | 

## Example

```python
from openapi_client.models.update_template_active_version_request import UpdateTemplateActiveVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateTemplateActiveVersionRequest from a JSON string
update_template_active_version_request_instance = UpdateTemplateActiveVersionRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateTemplateActiveVersionRequest.to_json())

# convert the object into a dict
update_template_active_version_request_dict = update_template_active_version_request_instance.to_dict()
# create an instance of UpdateTemplateActiveVersionRequest from a dict
update_template_active_version_request_from_dict = UpdateTemplateActiveVersionRequest.from_dict(update_template_active_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


