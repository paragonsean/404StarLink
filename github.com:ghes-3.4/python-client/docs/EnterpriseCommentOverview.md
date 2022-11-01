# EnterpriseCommentOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_commit_comments** | **int** |  | 
**total_gist_comments** | **int** |  | 
**total_issue_comments** | **int** |  | 
**total_pull_request_comments** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_comment_overview import EnterpriseCommentOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseCommentOverview from a JSON string
enterprise_comment_overview_instance = EnterpriseCommentOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseCommentOverview.to_json())

# convert the object into a dict
enterprise_comment_overview_dict = enterprise_comment_overview_instance.to_dict()
# create an instance of EnterpriseCommentOverview from a dict
enterprise_comment_overview_from_dict = EnterpriseCommentOverview.from_dict(enterprise_comment_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


