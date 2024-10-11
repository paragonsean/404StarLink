# LifeCycleLastTest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finalized** | [**LifeCycleLastTestFinalized**](LifeCycleLastTestFinalized.md) |  | [optional] 
**initiated** | [**LifeCycleLastTestInitiated**](LifeCycleLastTestInitiated.md) |  | [optional] 
**reverted** | [**LifeCycleLastTestReverted**](LifeCycleLastTestReverted.md) |  | [optional] 

## Example

```python
from openapi_client.models.life_cycle_last_test import LifeCycleLastTest

# TODO update the JSON string below
json = "{}"
# create an instance of LifeCycleLastTest from a JSON string
life_cycle_last_test_instance = LifeCycleLastTest.from_json(json)
# print the JSON string representation of the object
print(LifeCycleLastTest.to_json())

# convert the object into a dict
life_cycle_last_test_dict = life_cycle_last_test_instance.to_dict()
# create an instance of LifeCycleLastTest from a dict
life_cycle_last_test_from_dict = LifeCycleLastTest.from_dict(life_cycle_last_test_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


