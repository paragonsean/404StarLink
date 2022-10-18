# Action


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignore_if_not_present** | **bool** | This optional parameter is useful when the target element occasionally may not be present in the DOM. | [optional] 
**selector** | **str** | Some websites require clicking &#39;More&#39; button while scrolling a page. Put here &#39;More&#39; button valid CSS Selector. | [optional] 
**value** | **str** | Sequence of keys to send. Keys can include keystrokes such as ALT+A, ENTER, BACKSPACE, etc. | [optional] 
**skip_last_iteration** | **bool** | It is only used for loop actions only. Skips the last iteration. | [optional] 
**wait_delay** | **str** | Wait time (in milliseconds). | [optional] 
**script** | **str** | The JavaScript snippet to run | [optional] 
**actions** | [**List[Action]**](Action.md) | list of actions combined in the loop are executed step-by-step | [optional] [default to []]
**times** | **int** | The number of times to scroll down a web page. | [optional] 
**scroll_by_pixels** | **float** | Scrolls a web page by the number of pixels specified by &#39;scrollByPixels&#39; parameter. | [optional] 
**scrolling_element_selector** | **str** | Optionally specify here a valid CSS Selector of scrolling element. | [optional] 

## Example

```python
from openapi_client.models.action import Action

# TODO update the JSON string below
json = "{}"
# create an instance of Action from a JSON string
action_instance = Action.from_json(json)
# print the JSON string representation of the object
print(Action.to_json())

# convert the object into a dict
action_dict = action_instance.to_dict()
# create an instance of Action from a dict
action_from_dict = Action.from_dict(action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


