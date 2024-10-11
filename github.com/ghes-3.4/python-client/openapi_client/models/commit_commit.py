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
from openapi_client.models.commit_commit_tree import CommitCommitTree
from openapi_client.models.nullable_git_user import NullableGitUser
from openapi_client.models.verification import Verification
from typing import Optional, Set
from typing_extensions import Self

class CommitCommit(BaseModel):
    """
    CommitCommit
    """ # noqa: E501
    author: Optional[NullableGitUser]
    comment_count: StrictInt
    committer: Optional[NullableGitUser]
    message: StrictStr
    tree: CommitCommitTree
    url: StrictStr
    verification: Optional[Verification] = None
    __properties: ClassVar[List[str]] = ["author", "comment_count", "committer", "message", "tree", "url", "verification"]

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
        """Create an instance of CommitCommit from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of author
        if self.author:
            _dict['author'] = self.author.to_dict()
        # override the default output from pydantic by calling `to_dict()` of committer
        if self.committer:
            _dict['committer'] = self.committer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of tree
        if self.tree:
            _dict['tree'] = self.tree.to_dict()
        # override the default output from pydantic by calling `to_dict()` of verification
        if self.verification:
            _dict['verification'] = self.verification.to_dict()
        # set to None if author (nullable) is None
        # and model_fields_set contains the field
        if self.author is None and "author" in self.model_fields_set:
            _dict['author'] = None

        # set to None if committer (nullable) is None
        # and model_fields_set contains the field
        if self.committer is None and "committer" in self.model_fields_set:
            _dict['committer'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CommitCommit from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "author": NullableGitUser.from_dict(obj["author"]) if obj.get("author") is not None else None,
            "comment_count": obj.get("comment_count"),
            "committer": NullableGitUser.from_dict(obj["committer"]) if obj.get("committer") is not None else None,
            "message": obj.get("message"),
            "tree": CommitCommitTree.from_dict(obj["tree"]) if obj.get("tree") is not None else None,
            "url": obj.get("url"),
            "verification": Verification.from_dict(obj["verification"]) if obj.get("verification") is not None else None
        })
        return _obj


