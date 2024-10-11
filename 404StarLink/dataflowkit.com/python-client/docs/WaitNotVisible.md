# WaitNotVisible

Wait for the target element to become invisible on the page.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selector** | **str** | Must be a valid CSS Selector for the target element. | [optional] 

## Example

```python
from openapi_client.models.wait_not_visible import WaitNotVisible

# TODO update the JSON string below
json = "{}"
# create an instance of WaitNotVisible from a JSON string
wait_not_visible_instance = WaitNotVisible.from_json(json)
# print the JSON string representation of the object
print(WaitNotVisible.to_json())

# convert the object into a dict
wait_not_visible_dict = wait_not_visible_instance.to_dict()
# create an instance of WaitNotVisible from a dict
wait_not_visible_from_dict = WaitNotVisible.from_dict(wait_not_visible_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


