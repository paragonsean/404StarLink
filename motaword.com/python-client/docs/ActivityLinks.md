# ActivityLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**comments** | [**Href**](Href.md) |  | [optional] 
**project** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.activity_links import ActivityLinks

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityLinks from a JSON string
activity_links_instance = ActivityLinks.from_json(json)
# print the JSON string representation of the object
print(ActivityLinks.to_json())

# convert the object into a dict
activity_links_dict = activity_links_instance.to_dict()
# create an instance of ActivityLinks from a dict
activity_links_from_dict = ActivityLinks.from_dict(activity_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


