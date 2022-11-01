# FileCommit

File Commit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commit** | [**FileCommitCommit**](FileCommitCommit.md) |  | 
**content** | [**FileCommitContent**](FileCommitContent.md) |  | 

## Example

```python
from openapi_client.models.file_commit import FileCommit

# TODO update the JSON string below
json = "{}"
# create an instance of FileCommit from a JSON string
file_commit_instance = FileCommit.from_json(json)
# print the JSON string representation of the object
print(FileCommit.to_json())

# convert the object into a dict
file_commit_dict = file_commit_instance.to_dict()
# create an instance of FileCommit from a dict
file_commit_from_dict = FileCommit.from_dict(file_commit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


