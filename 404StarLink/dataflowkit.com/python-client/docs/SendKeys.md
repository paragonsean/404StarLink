# SendKeys

The Send Keys action simulates real user input of key by key into a given string. It mimics real user behavior, such as the inability to type into invisible or read-only DOM elements. This action is useful for cases where explicit keystroke events are required, like auto-completing combo boxes. Unlike a similar 'input' action, which forces a specified value directly into an input selector, this action does not overwrite existing content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignore_if_not_present** | **bool** |  | [optional] 
**selector** | **str** | Must be a valid CSS Selector | [optional] 
**value** | **str** | Sequence of keys to send. Keys can include keystrokes such as ALT+A, ENTER, BACKSPACE, etc. | [optional] 

## Example

```python
from openapi_client.models.send_keys import SendKeys

# TODO update the JSON string below
json = "{}"
# create an instance of SendKeys from a JSON string
send_keys_instance = SendKeys.from_json(json)
# print the JSON string representation of the object
print(SendKeys.to_json())

# convert the object into a dict
send_keys_dict = send_keys_instance.to_dict()
# create an instance of SendKeys from a dict
send_keys_from_dict = SendKeys.from_dict(send_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


