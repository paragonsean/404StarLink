# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.simple_model import SimpleModel
from typing import Optional, Set
from typing_extensions import Self

class QaEntry(BaseModel):
    """
    QaEntry
    """ # noqa: E501
    category: Optional[StrictStr] = None
    comment: Optional[StrictStr] = None
    doc_id: Optional[StrictStr] = Field(default=None, alias="docId")
    editor_link: Optional[StrictStr] = Field(default=None, alias="editorLink")
    end: Optional[StrictInt] = None
    in_source: Optional[StrictBool] = Field(default=None, alias="inSource")
    is_current: Optional[StrictBool] = Field(default=None, alias="isCurrent")
    module: Optional[StrictStr] = None
    project_id: Optional[SimpleModel] = Field(default=None, alias="projectId")
    severity: Optional[StrictStr] = None
    source: Optional[StrictStr] = None
    source_language: Optional[SimpleModel] = Field(default=None, alias="sourceLanguage")
    start: Optional[StrictInt] = None
    state: Optional[StrictStr] = None
    target_language: Optional[SimpleModel] = Field(default=None, alias="targetLanguage")
    translation: Optional[StrictStr] = None
    unique_key: Optional[StrictStr] = Field(default=None, alias="uniqueKey")
    vendor: Optional[SimpleModel] = None
    __properties: ClassVar[List[str]] = ["category", "comment", "docId", "editorLink", "end", "inSource", "isCurrent", "module", "projectId", "severity", "source", "sourceLanguage", "start", "state", "targetLanguage", "translation", "uniqueKey", "vendor"]

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
        """Create an instance of QaEntry from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of project_id
        if self.project_id:
            _dict['projectId'] = self.project_id.to_dict()
        # override the default output from pydantic by calling `to_dict()` of source_language
        if self.source_language:
            _dict['sourceLanguage'] = self.source_language.to_dict()
        # override the default output from pydantic by calling `to_dict()` of target_language
        if self.target_language:
            _dict['targetLanguage'] = self.target_language.to_dict()
        # override the default output from pydantic by calling `to_dict()` of vendor
        if self.vendor:
            _dict['vendor'] = self.vendor.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of QaEntry from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "category": obj.get("category"),
            "comment": obj.get("comment"),
            "docId": obj.get("docId"),
            "editorLink": obj.get("editorLink"),
            "end": obj.get("end"),
            "inSource": obj.get("inSource"),
            "isCurrent": obj.get("isCurrent"),
            "module": obj.get("module"),
            "projectId": SimpleModel.from_dict(obj["projectId"]) if obj.get("projectId") is not None else None,
            "severity": obj.get("severity"),
            "source": obj.get("source"),
            "sourceLanguage": SimpleModel.from_dict(obj["sourceLanguage"]) if obj.get("sourceLanguage") is not None else None,
            "start": obj.get("start"),
            "state": obj.get("state"),
            "targetLanguage": SimpleModel.from_dict(obj["targetLanguage"]) if obj.get("targetLanguage") is not None else None,
            "translation": obj.get("translation"),
            "uniqueKey": obj.get("uniqueKey"),
            "vendor": SimpleModel.from_dict(obj["vendor"]) if obj.get("vendor") is not None else None
        })
        return _obj


