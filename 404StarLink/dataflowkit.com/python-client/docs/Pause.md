# Pause

Wait for the specified amount of time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wait_delay** | **str** | Wait time (in milliseconds). | [optional] 

## Example

```python
from openapi_client.models.pause import Pause

# TODO update the JSON string below
json = "{}"
# create an instance of Pause from a JSON string
pause_instance = Pause.from_json(json)
# print the JSON string representation of the object
print(Pause.to_json())

# convert the object into a dict
pause_dict = pause_instance.to_dict()
# create an instance of Pause from a dict
pause_from_dict = Pause.from_dict(pause_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


