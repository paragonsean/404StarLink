# WaitVisible

Wait for the target element to become visible on the page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selector** | **str** | Must be a valid CSS Selector for the target element. | [optional] 

## Example

```python
from openapi_client.models.wait_visible import WaitVisible

# TODO update the JSON string below
json = "{}"
# create an instance of WaitVisible from a JSON string
wait_visible_instance = WaitVisible.from_json(json)
# print the JSON string representation of the object
print(WaitVisible.to_json())

# convert the object into a dict
wait_visible_dict = wait_visible_instance.to_dict()
# create an instance of WaitVisible from a dict
wait_visible_from_dict = WaitVisible.from_dict(wait_visible_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


