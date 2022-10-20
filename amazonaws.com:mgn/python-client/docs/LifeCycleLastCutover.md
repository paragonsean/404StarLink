# LifeCycleLastCutover


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finalized** | [**LifeCycleLastCutoverFinalized**](LifeCycleLastCutoverFinalized.md) |  | [optional] 
**initiated** | [**LifeCycleLastCutoverInitiated**](LifeCycleLastCutoverInitiated.md) |  | [optional] 
**reverted** | [**LifeCycleLastCutoverReverted**](LifeCycleLastCutoverReverted.md) |  | [optional] 

## Example

```python
from openapi_client.models.life_cycle_last_cutover import LifeCycleLastCutover

# TODO update the JSON string below
json = "{}"
# create an instance of LifeCycleLastCutover from a JSON string
life_cycle_last_cutover_instance = LifeCycleLastCutover.from_json(json)
# print the JSON string representation of the object
print(LifeCycleLastCutover.to_json())

# convert the object into a dict
life_cycle_last_cutover_dict = life_cycle_last_cutover_instance.to_dict()
# create an instance of LifeCycleLastCutover from a dict
life_cycle_last_cutover_from_dict = LifeCycleLastCutover.from_dict(life_cycle_last_cutover_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


