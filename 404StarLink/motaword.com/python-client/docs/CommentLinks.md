# CommentLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**activity** | [**Href**](Href.md) |  | [optional] 
**project** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.comment_links import CommentLinks

# TODO update the JSON string below
json = "{}"
# create an instance of CommentLinks from a JSON string
comment_links_instance = CommentLinks.from_json(json)
# print the JSON string representation of the object
print(CommentLinks.to_json())

# convert the object into a dict
comment_links_dict = comment_links_instance.to_dict()
# create an instance of CommentLinks from a dict
comment_links_from_dict = CommentLinks.from_dict(comment_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


