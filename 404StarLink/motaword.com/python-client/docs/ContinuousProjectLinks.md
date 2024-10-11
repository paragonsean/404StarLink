# ContinuousProjectLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**editors** | [**Dict[str, Href]**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_links import ContinuousProjectLinks

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectLinks from a JSON string
continuous_project_links_instance = ContinuousProjectLinks.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectLinks.to_json())

# convert the object into a dict
continuous_project_links_dict = continuous_project_links_instance.to_dict()
# create an instance of ContinuousProjectLinks from a dict
continuous_project_links_from_dict = ContinuousProjectLinks.from_dict(continuous_project_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


