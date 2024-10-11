# TemplateActiveVersionRequest

Specifies which version of a message template to use as the active version of the template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_active_version_request import TemplateActiveVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateActiveVersionRequest from a JSON string
template_active_version_request_instance = TemplateActiveVersionRequest.from_json(json)
# print the JSON string representation of the object
print(TemplateActiveVersionRequest.to_json())

# convert the object into a dict
template_active_version_request_dict = template_active_version_request_instance.to_dict()
# create an instance of TemplateActiveVersionRequest from a dict
template_active_version_request_from_dict = TemplateActiveVersionRequest.from_dict(template_active_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


