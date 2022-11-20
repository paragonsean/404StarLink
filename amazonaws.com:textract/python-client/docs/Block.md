# Block

<p>A <code>Block</code> represents items that are recognized in a document within a group of pixels close to each other. The information returned in a <code>Block</code> object depends on the type of operation. In text detection for documents (for example <a>DetectDocumentText</a>), you get information about the detected words and lines of text. In text analysis (for example <a>AnalyzeDocument</a>), you can also get information about the fields, tables, and selection elements that are detected in the document.</p> <p>An array of <code>Block</code> objects is returned by both synchronous and asynchronous operations. In synchronous operations, such as <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the entire set of results. In asynchronous operations, such as <a>GetDocumentAnalysis</a>, the array is returned over one or more responses.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html\">How Amazon Textract Works</a>.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block_type** | [**BlockType**](BlockType.md) |  | [optional] 
**confidence** | **float** |  | [optional] 
**text** | **str** |  | [optional] 
**text_type** | [**TextType**](TextType.md) |  | [optional] 
**row_index** | **int** |  | [optional] 
**column_index** | **int** |  | [optional] 
**row_span** | **int** |  | [optional] 
**column_span** | **int** |  | [optional] 
**geometry** | [**BlockGeometry**](BlockGeometry.md) |  | [optional] 
**id** | **str** |  | [optional] 
**relationships** | **List** |  | [optional] 
**entity_types** | **List** |  | [optional] 
**selection_status** | [**SelectionStatus**](SelectionStatus.md) |  | [optional] 
**page** | **int** |  | [optional] 
**query** | [**BlockQuery**](BlockQuery.md) |  | [optional] 

## Example

```python
from openapi_client.models.block import Block

# TODO update the JSON string below
json = "{}"
# create an instance of Block from a JSON string
block_instance = Block.from_json(json)
# print the JSON string representation of the object
print(Block.to_json())

# convert the object into a dict
block_dict = block_instance.to_dict()
# create an instance of Block from a dict
block_from_dict = Block.from_dict(block_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


