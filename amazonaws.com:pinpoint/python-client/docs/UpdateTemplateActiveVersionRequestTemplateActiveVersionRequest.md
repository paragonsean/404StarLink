# UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest

Specifies which version of a message template to use as the active version of the template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_template_active_version_request_template_active_version_request import UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest from a JSON string
update_template_active_version_request_template_active_version_request_instance = UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest.to_json())

# convert the object into a dict
update_template_active_version_request_template_active_version_request_dict = update_template_active_version_request_template_active_version_request_instance.to_dict()
# create an instance of UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest from a dict
update_template_active_version_request_template_active_version_request_from_dict = UpdateTemplateActiveVersionRequestTemplateActiveVersionRequest.from_dict(update_template_active_version_request_template_active_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


