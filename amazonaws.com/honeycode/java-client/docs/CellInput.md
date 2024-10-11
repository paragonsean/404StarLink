

# CellInput

<p> CellInput object contains the data needed to create or update cells in a table. </p> <note> <p> CellInput object has only a facts field or a fact field, but not both. A 400 bad request will be thrown if both fact and facts field are present. </p> </note>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fact** | [**String**](String.md) |  |  [optional] |
|**facts** | [**List**](List.md) |  |  [optional] |



