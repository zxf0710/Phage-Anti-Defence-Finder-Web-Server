import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listList(query) {
  return request({
    url: '/system/list/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getList(genomeId) {
  return request({
    url: '/system/list/' + genomeId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addList(data) {
  return request({
    url: '/system/list',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateList(data) {
  return request({
    url: '/system/list',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delList(genomeId) {
  return request({
    url: '/system/list/' + genomeId,
    method: 'delete'
  })
}

//上传文件运行prodigal
export function gupload(data) {
  return request({
    url: '/system/list/gupload',
    method: 'put',
    data: data
  })
}
