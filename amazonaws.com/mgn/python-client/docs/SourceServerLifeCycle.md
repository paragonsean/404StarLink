# SourceServerLifeCycle


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added_to_service_date_time** | **str** |  | [optional] 
**elapsed_replication_duration** | **str** |  | [optional] 
**first_byte_date_time** | **str** |  | [optional] 
**last_cutover** | [**LifeCycleLastCutover**](LifeCycleLastCutover.md) |  | [optional] 
**last_seen_by_service_date_time** | **str** |  | [optional] 
**last_test** | [**LifeCycleLastTest**](LifeCycleLastTest.md) |  | [optional] 
**state** | [**LifeCycleState**](LifeCycleState.md) |  | [optional] 

## Example

```python
from openapi_client.models.source_server_life_cycle import SourceServerLifeCycle

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerLifeCycle from a JSON string
source_server_life_cycle_instance = SourceServerLifeCycle.from_json(json)
# print the JSON string representation of the object
print(SourceServerLifeCycle.to_json())

# convert the object into a dict
source_server_life_cycle_dict = source_server_life_cycle_instance.to_dict()
# create an instance of SourceServerLifeCycle from a dict
source_server_life_cycle_from_dict = SourceServerLifeCycle.from_dict(source_server_life_cycle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


