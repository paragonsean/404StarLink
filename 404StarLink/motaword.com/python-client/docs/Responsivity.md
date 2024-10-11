# Responsivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invited** | **int** |  | [optional] 
**month** | **str** |  | [optional] 
**not_entered** | **int** |  | [optional] 
**only_entered** | **int** |  | [optional] 
**score** | **float** |  | [optional] 
**week** | **str** |  | [optional] 
**worked** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.responsivity import Responsivity

# TODO update the JSON string below
json = "{}"
# create an instance of Responsivity from a JSON string
responsivity_instance = Responsivity.from_json(json)
# print the JSON string representation of the object
print(Responsivity.to_json())

# convert the object into a dict
responsivity_dict = responsivity_instance.to_dict()
# create an instance of Responsivity from a dict
responsivity_from_dict = Responsivity.from_dict(responsivity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


