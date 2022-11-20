# coding: utf-8

"""
    Amazon Textract

    Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API reference documentation for Amazon Textract.

    The version of the OpenAPI document: 2018-06-27
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
from openapi_client.models.get_document_analysis_response_document_metadata import GetDocumentAnalysisResponseDocumentMetadata
from typing import Optional, Set
from typing_extensions import Self

class GetDocumentAnalysisResponse(BaseModel):
    """
    GetDocumentAnalysisResponse
    """ # noqa: E501
    document_metadata: Optional[GetDocumentAnalysisResponseDocumentMetadata] = Field(default=None, alias="DocumentMetadata")
    job_status: Optional[Any] = Field(default=None, alias="JobStatus")
    next_token: Optional[Any] = Field(default=None, alias="NextToken")
    blocks: Optional[Any] = Field(default=None, alias="Blocks")
    warnings: Optional[Any] = Field(default=None, alias="Warnings")
    status_message: Optional[Any] = Field(default=None, alias="StatusMessage")
    analyze_document_model_version: Optional[Any] = Field(default=None, alias="AnalyzeDocumentModelVersion")
    __properties: ClassVar[List[str]] = ["DocumentMetadata", "JobStatus", "NextToken", "Blocks", "Warnings", "StatusMessage", "AnalyzeDocumentModelVersion"]

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
        """Create an instance of GetDocumentAnalysisResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of document_metadata
        if self.document_metadata:
            _dict['DocumentMetadata'] = self.document_metadata.to_dict()
        # override the default output from pydantic by calling `to_dict()` of job_status
        if self.job_status:
            _dict['JobStatus'] = self.job_status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetDocumentAnalysisResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "DocumentMetadata": GetDocumentAnalysisResponseDocumentMetadata.from_dict(obj["DocumentMetadata"]) if obj.get("DocumentMetadata") is not None else None,
            "JobStatus": JobStatus.from_dict(obj["JobStatus"]) if obj.get("JobStatus") is not None else None,
            "NextToken": obj.get("NextToken"),
            "Blocks": obj.get("Blocks"),
            "Warnings": obj.get("Warnings"),
            "StatusMessage": obj.get("StatusMessage"),
            "AnalyzeDocumentModelVersion": obj.get("AnalyzeDocumentModelVersion")
        })
        return _obj


