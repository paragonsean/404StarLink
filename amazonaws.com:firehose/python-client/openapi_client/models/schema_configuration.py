# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
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

class SchemaConfiguration(BaseModel):
    """
    Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3. This parameter is required if <code>Enabled</code> is set to true.
    """ # noqa: E501
    role_arn: Optional[Any] = Field(default=None, alias="RoleARN")
    catalog_id: Optional[Any] = Field(default=None, alias="CatalogId")
    database_name: Optional[Any] = Field(default=None, alias="DatabaseName")
    table_name: Optional[Any] = Field(default=None, alias="TableName")
    region: Optional[Any] = Field(default=None, alias="Region")
    version_id: Optional[Any] = Field(default=None, alias="VersionId")
    __properties: ClassVar[List[str]] = ["RoleARN", "CatalogId", "DatabaseName", "TableName", "Region", "VersionId"]

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
        """Create an instance of SchemaConfiguration from a JSON string"""
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
        """Create an instance of SchemaConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "RoleARN": obj.get("RoleARN"),
            "CatalogId": obj.get("CatalogId"),
            "DatabaseName": obj.get("DatabaseName"),
            "TableName": obj.get("TableName"),
            "Region": obj.get("Region"),
            "VersionId": obj.get("VersionId")
        })
        return _obj


