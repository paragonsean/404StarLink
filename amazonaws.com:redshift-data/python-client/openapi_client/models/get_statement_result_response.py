# coding: utf-8

"""
    Redshift Data API Service

    <p>You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run SQL statements, which are committed if the statement succeeds. </p> <p>For more information about the Amazon Redshift Data API and CLI usage examples, see <a href=\"https://docs.aws.amazon.com/redshift/latest/mgmt/data-api.html\">Using the Amazon Redshift Data API</a> in the <i>Amazon Redshift Management Guide</i>. </p>

    The version of the OpenAPI document: 2019-12-20
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class GetStatementResultResponse(BaseModel):
    """
    GetStatementResultResponse
    """ # noqa: E501
    column_metadata: Optional[Any] = Field(default=None, alias="ColumnMetadata")
    next_token: Optional[Any] = Field(default=None, alias="NextToken")
    records: Any = Field(alias="Records")
    total_num_rows: Optional[Any] = Field(default=None, alias="TotalNumRows")
    __properties: ClassVar[List[str]] = ["ColumnMetadata", "NextToken", "Records", "TotalNumRows"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of GetStatementResultResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetStatementResultResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ColumnMetadata": obj.get("ColumnMetadata"),
            "NextToken": obj.get("NextToken"),
            "Records": obj.get("Records"),
            "TotalNumRows": obj.get("TotalNumRows")
        })
        return _obj


