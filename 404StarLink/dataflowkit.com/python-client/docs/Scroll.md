# Scroll

Scroll a page down to load more content, simulating user interaction with infinite scrolled pages. Or specify the element's CSS Selector to click for loading more content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scroll_by_pixels** | **float** | Scrolls a web page by the number of pixels specified by &#39;scrollByPixels&#39; parameter. | [optional] 
**scrolling_element_selector** | **str** | Optionally specify here a valid CSS Selector of scrolling element. | [optional] 
**selector** | **str** | Some websites require clicking &#39;More&#39; button while scrolling a page. Put here &#39;More&#39; button valid CSS Selector. | [optional] 
**times** | **int** | The number of times to scroll down a web page. | [optional] 

## Example

```python
from openapi_client.models.scroll import Scroll

# TODO update the JSON string below
json = "{}"
# create an instance of Scroll from a JSON string
scroll_instance = Scroll.from_json(json)
# print the JSON string representation of the object
print(Scroll.to_json())

# convert the object into a dict
scroll_dict = scroll_instance.to_dict()
# create an instance of Scroll from a dict
scroll_from_dict = Scroll.from_dict(scroll_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


