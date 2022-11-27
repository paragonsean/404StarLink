# TemplateVersionsResponse

Provides information about all the versions of a specific message template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**message** | **str** |  | [optional] 
**next_token** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_versions_response import TemplateVersionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateVersionsResponse from a JSON string
template_versions_response_instance = TemplateVersionsResponse.from_json(json)
# print the JSON string representation of the object
print(TemplateVersionsResponse.to_json())

# convert the object into a dict
template_versions_response_dict = template_versions_response_instance.to_dict()
# create an instance of TemplateVersionsResponse from a dict
template_versions_response_from_dict = TemplateVersionsResponse.from_dict(template_versions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


