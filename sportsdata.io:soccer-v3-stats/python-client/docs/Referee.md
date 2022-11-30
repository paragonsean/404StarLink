# Referee


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**nationality** | **str** |  | [optional] 
**referee_id** | **int** |  | [optional] 
**short_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.referee import Referee

# TODO update the JSON string below
json = "{}"
# create an instance of Referee from a JSON string
referee_instance = Referee.from_json(json)
# print the JSON string representation of the object
print(Referee.to_json())

# convert the object into a dict
referee_dict = referee_instance.to_dict()
# create an instance of Referee from a dict
referee_from_dict = Referee.from_dict(referee_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


