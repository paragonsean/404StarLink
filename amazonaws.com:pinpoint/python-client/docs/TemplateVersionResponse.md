# TemplateVersionResponse

Provides information about a specific version of a message template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_date** | **str** |  | 
**default_substitutions** | **str** |  | [optional] 
**last_modified_date** | **str** |  | 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | **str** |  | 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_version_response import TemplateVersionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateVersionResponse from a JSON string
template_version_response_instance = TemplateVersionResponse.from_json(json)
# print the JSON string representation of the object
print(TemplateVersionResponse.to_json())

# convert the object into a dict
template_version_response_dict = template_version_response_instance.to_dict()
# create an instance of TemplateVersionResponse from a dict
template_version_response_from_dict = TemplateVersionResponse.from_dict(template_version_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


