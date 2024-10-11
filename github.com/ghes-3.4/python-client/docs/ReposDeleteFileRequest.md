# ReposDeleteFileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**ReposDeleteFileRequestAuthor**](ReposDeleteFileRequestAuthor.md) |  | [optional] 
**branch** | **str** | The branch name. Default: the repository’s default branch (usually &#x60;master&#x60;) | [optional] 
**committer** | [**ReposDeleteFileRequestCommitter**](ReposDeleteFileRequestCommitter.md) |  | [optional] 
**message** | **str** | The commit message. | 
**sha** | **str** | The blob SHA of the file being deleted. | 

## Example

```python
from openapi_client.models.repos_delete_file_request import ReposDeleteFileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReposDeleteFileRequest from a JSON string
repos_delete_file_request_instance = ReposDeleteFileRequest.from_json(json)
# print the JSON string representation of the object
print(ReposDeleteFileRequest.to_json())

# convert the object into a dict
repos_delete_file_request_dict = repos_delete_file_request_instance.to_dict()
# create an instance of ReposDeleteFileRequest from a dict
repos_delete_file_request_from_dict = ReposDeleteFileRequest.from_dict(repos_delete_file_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


