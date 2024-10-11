# GistComment

A comment made to a gist.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** | The comment text. | 
**created_at** | **datetime** |  | 
**id** | **int** |  | 
**node_id** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.gist_comment import GistComment

# TODO update the JSON string below
json = "{}"
# create an instance of GistComment from a JSON string
gist_comment_instance = GistComment.from_json(json)
# print the JSON string representation of the object
print(GistComment.to_json())

# convert the object into a dict
gist_comment_dict = gist_comment_instance.to_dict()
# create an instance of GistComment from a dict
gist_comment_from_dict = GistComment.from_dict(gist_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


