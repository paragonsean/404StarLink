# Click

Clicks on a target element (such as a link, button, checkbox, or radio button) with specified CSS Selector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignore_if_not_present** | **bool** | This optional parameter is useful when the target element occasionally may not be present in the DOM. | [optional] 
**selector** | **str** | Must be a valid CSS Selector | [optional] 
**skip_last_iteration** | **bool** | It is only used for click action inside a loop only. Skips the last iteration. | [optional] 

## Example

```python
from openapi_client.models.click import Click

# TODO update the JSON string below
json = "{}"
# create an instance of Click from a JSON string
click_instance = Click.from_json(json)
# print the JSON string representation of the object
print(Click.to_json())

# convert the object into a dict
click_dict = click_instance.to_dict()
# create an instance of Click from a dict
click_from_dict = Click.from_dict(click_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


