# Jsclick

Click on an element with the specified CSS Selector. JS Click internally invokes a script (Javascript) that clicks the element.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignore_if_not_present** | **bool** | This optional parameter is useful when the target element occasionally may not be present in the DOM. | [optional] 
**selector** | **str** | Must be a valid CSS Selector for the target element. | [optional] 
**skip_last_iteration** | **bool** | It is only used for click action inside a loop only. Skips the last iteration. | [optional] 

## Example

```python
from openapi_client.models.jsclick import Jsclick

# TODO update the JSON string below
json = "{}"
# create an instance of Jsclick from a JSON string
jsclick_instance = Jsclick.from_json(json)
# print the JSON string representation of the object
print(Jsclick.to_json())

# convert the object into a dict
jsclick_dict = jsclick_instance.to_dict()
# create an instance of Jsclick from a dict
jsclick_from_dict = Jsclick.from_dict(jsclick_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


