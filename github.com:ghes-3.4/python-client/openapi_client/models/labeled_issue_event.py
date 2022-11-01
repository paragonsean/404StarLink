# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.labeled_issue_event_label import LabeledIssueEventLabel
from openapi_client.models.nullable_integration import NullableIntegration
from openapi_client.models.simple_user import SimpleUser
from typing import Optional, Set
from typing_extensions import Self

class LabeledIssueEvent(BaseModel):
    """
    Labeled Issue Event
    """ # noqa: E501
    actor: SimpleUser
    commit_id: Optional[StrictStr]
    commit_url: Optional[StrictStr]
    created_at: StrictStr
    event: StrictStr
    id: StrictInt
    label: LabeledIssueEventLabel
    node_id: StrictStr
    performed_via_github_app: Optional[NullableIntegration]
    url: StrictStr
    __properties: ClassVar[List[str]] = ["actor", "commit_id", "commit_url", "created_at", "event", "id", "label", "node_id", "performed_via_github_app", "url"]

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
        """Create an instance of LabeledIssueEvent from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of actor
        if self.actor:
            _dict['actor'] = self.actor.to_dict()
        # override the default output from pydantic by calling `to_dict()` of label
        if self.label:
            _dict['label'] = self.label.to_dict()
        # override the default output from pydantic by calling `to_dict()` of performed_via_github_app
        if self.performed_via_github_app:
            _dict['performed_via_github_app'] = self.performed_via_github_app.to_dict()
        # set to None if commit_id (nullable) is None
        # and model_fields_set contains the field
        if self.commit_id is None and "commit_id" in self.model_fields_set:
            _dict['commit_id'] = None

        # set to None if commit_url (nullable) is None
        # and model_fields_set contains the field
        if self.commit_url is None and "commit_url" in self.model_fields_set:
            _dict['commit_url'] = None

        # set to None if performed_via_github_app (nullable) is None
        # and model_fields_set contains the field
        if self.performed_via_github_app is None and "performed_via_github_app" in self.model_fields_set:
            _dict['performed_via_github_app'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of LabeledIssueEvent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "actor": SimpleUser.from_dict(obj["actor"]) if obj.get("actor") is not None else None,
            "commit_id": obj.get("commit_id"),
            "commit_url": obj.get("commit_url"),
            "created_at": obj.get("created_at"),
            "event": obj.get("event"),
            "id": obj.get("id"),
            "label": LabeledIssueEventLabel.from_dict(obj["label"]) if obj.get("label") is not None else None,
            "node_id": obj.get("node_id"),
            "performed_via_github_app": NullableIntegration.from_dict(obj["performed_via_github_app"]) if obj.get("performed_via_github_app") is not None else None,
            "url": obj.get("url")
        })
        return _obj


