# S3Object

<p>The S3 bucket name and file name that identifies the document.</p> <p>The AWS Region for the S3 bucket that contains the document must match the Region that you use for Amazon Textract operations.</p> <p>For Amazon Textract to process a file in an S3 bucket, the user must have permission to access the S3 bucket and file. </p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.s3_object import S3Object

# TODO update the JSON string below
json = "{}"
# create an instance of S3Object from a JSON string
s3_object_instance = S3Object.from_json(json)
# print the JSON string representation of the object
print(S3Object.to_json())

# convert the object into a dict
s3_object_dict = s3_object_instance.to_dict()
# create an instance of S3Object from a dict
s3_object_from_dict = S3Object.from_dict(s3_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


