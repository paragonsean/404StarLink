# ProjectLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**documents** | [**Href**](Href.md) |  | [optional] 
**glossaries** | [**Href**](Href.md) |  | [optional] 
**payment** | [**Href**](Href.md) |  | [optional] 
**quote_pdf** | [**Href**](Href.md) |  | [optional] 
**styleguides** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.project_links import ProjectLinks

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectLinks from a JSON string
project_links_instance = ProjectLinks.from_json(json)
# print the JSON string representation of the object
print(ProjectLinks.to_json())

# convert the object into a dict
project_links_dict = project_links_instance.to_dict()
# create an instance of ProjectLinks from a dict
project_links_from_dict = ProjectLinks.from_dict(project_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


