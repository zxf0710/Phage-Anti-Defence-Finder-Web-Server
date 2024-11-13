import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSequence(query) {
  return request({
    url: '/system/sequence/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSequence(fileId) {
  return request({
    url: '/system/sequence/' + fileId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSequence(data) {
  return request({
    url: '/system/sequence',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSequence(data) {
  return request({
    url: '/system/sequence',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSequence(fileId) {
  return request({
    url: '/system/sequence/' + fileId,
    method: 'delete'
  })
}
// 上传fasta文件并执行cmd
export function upload(data) {
  return request({
    url: '/system/sequence/upload',
    method: 'put',
    data: data
  })
}
