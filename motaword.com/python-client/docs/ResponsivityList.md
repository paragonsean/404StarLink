# ResponsivityList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**LinksMeta**](LinksMeta.md) |  | [optional] 
**responsivity** | [**List[Responsivity]**](Responsivity.md) |  | [optional] 

## Example

```python
from openapi_client.models.responsivity_list import ResponsivityList

# TODO update the JSON string below
json = "{}"
# create an instance of ResponsivityList from a JSON string
responsivity_list_instance = ResponsivityList.from_json(json)
# print the JSON string representation of the object
print(ResponsivityList.to_json())

# convert the object into a dict
responsivity_list_dict = responsivity_list_instance.to_dict()
# create an instance of ResponsivityList from a dict
responsivity_list_from_dict = ResponsivityList.from_dict(responsivity_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


