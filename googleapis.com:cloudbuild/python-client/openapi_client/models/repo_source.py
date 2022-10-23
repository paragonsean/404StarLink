# coding: utf-8

"""
    Cloud Build API

    Creates and manages builds on Google Cloud Platform.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class RepoSource(BaseModel):
    """
    Location of the source in a Google Cloud Source Repository.
    """ # noqa: E501
    branch_name: Optional[StrictStr] = Field(default=None, description="Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax", alias="branchName")
    commit_sha: Optional[StrictStr] = Field(default=None, description="Explicit commit SHA to build.", alias="commitSha")
    dir: Optional[StrictStr] = Field(default=None, description="Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for that step's execution.")
    invert_regex: Optional[StrictBool] = Field(default=None, description="Only trigger a build if the revision regex does NOT match the revision regex.", alias="invertRegex")
    project_id: Optional[StrictStr] = Field(default=None, description="ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.", alias="projectId")
    repo_name: Optional[StrictStr] = Field(default=None, description="Name of the Cloud Source Repository.", alias="repoName")
    substitutions: Optional[Dict[str, StrictStr]] = Field(default=None, description="Substitutions to use in a triggered build. Should only be used with RunBuildTrigger")
    tag_name: Optional[StrictStr] = Field(default=None, description="Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax", alias="tagName")
    __properties: ClassVar[List[str]] = ["branchName", "commitSha", "dir", "invertRegex", "projectId", "repoName", "substitutions", "tagName"]

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
        """Create an instance of RepoSource from a JSON string"""
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
        """Create an instance of RepoSource from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "branchName": obj.get("branchName"),
            "commitSha": obj.get("commitSha"),
            "dir": obj.get("dir"),
            "invertRegex": obj.get("invertRegex"),
            "projectId": obj.get("projectId"),
            "repoName": obj.get("repoName"),
            "substitutions": obj.get("substitutions"),
            "tagName": obj.get("tagName")
        })
        return _obj


