# ListTemplateVersionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_versions_response** | [**TemplateVersionsResponse**](TemplateVersionsResponse.md) |  | 

## Example

```python
from openapi_client.models.list_template_versions_response import ListTemplateVersionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTemplateVersionsResponse from a JSON string
list_template_versions_response_instance = ListTemplateVersionsResponse.from_json(json)
# print the JSON string representation of the object
print(ListTemplateVersionsResponse.to_json())

# convert the object into a dict
list_template_versions_response_dict = list_template_versions_response_instance.to_dict()
# create an instance of ListTemplateVersionsResponse from a dict
list_template_versions_response_from_dict = ListTemplateVersionsResponse.from_dict(list_template_versions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


